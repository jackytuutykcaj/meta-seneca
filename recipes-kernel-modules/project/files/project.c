#include <linux/i2c-dev.h>
#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main() {
  // Replace with the actual I2C bus number your device is connected to
  int bus = 5;
  // Replace with the 7-bit slave address of your MCP23017 device
  int address = 0x20;
  // Register address for GPIO Port B
  int reg_addr = 0x15;
  // Data value to set GPB1 high, GPB0 low
  int data = 0x01;

  char filename[20];
  int fd;

  // Open I2C device node
  snprintf(filename, sizeof(filename), "/dev/i2c-%d", bus);
  fd = open(filename, O_RDWR);
  if (fd < 0) {
    perror("Failed to open I2C device");
    return 1;
  }

  // Set slave address
  if (ioctl(fd, I2C_SLAVE, address) < 0) {
    perror("Failed to set slave address");
    close(fd);
    return 1;
  }

  // Write data to register
  char buffer[2];
  buffer[0] = reg_addr;
  buffer[1] = data;
  if (write(fd, buffer, 2) != 2) {
    perror("Failed to write to register %d". reg_addr);
    close(fd);
    return 1;
  }

  printf("Successfully wrote 0x02 to register 0x15 on MCP23017 at address 0x%02X\n", address);

  close(fd);
  return 0;
}
