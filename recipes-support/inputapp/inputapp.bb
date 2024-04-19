DESCRIPTION = "inputapp application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://input_app.c"

S = "${WORKDIR}"

do_compile() {
	${CC} ${LDFLAGS} input_app.c -o input_app
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 input_app ${D}${bindir}
}
