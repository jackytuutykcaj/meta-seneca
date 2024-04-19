DESCRIPTION = "Example library use"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "simple-library"

inherit cmake

SRC_URI = "file://Makefile \
           file://lab9program.cpp \
           file://COPYING \
          "


S = "${WORKDIR}"


do_install() {
    install -d ${D}${bindir}
    install -m 0755 tests/lab9program-test ${D}${bindir}/
}

FILES:${PN} += "${bindir}/lab9program-test"
