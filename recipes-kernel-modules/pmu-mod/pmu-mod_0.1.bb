SUMMARY = "Example of how to build an external Linux kernel module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://github.com/jackytuutykcaj/meta-seneca.git;branch=main;protocol=https"
SRCREV = "21e1f54817f95c64c72543545d223c87bd1bba5f"

S = "${WORKDIR}/git"

RPROVIDES:${PN} += "pmu-mod"
