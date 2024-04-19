DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/jackytuutykcaj/lnx500Project.git;branch=main;protocol=https"
SRCREV = "4878234c72e343c30c4864028caddf5b7ea6b0af"

S = "${WORKDIR}/git"

do_compile() {
	${CC} ${LDFLAGS} project.c -o project
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 project ${D}${bindir}
}
