SUMMARY = "Video4Linux command line utilities"
DESCRIPTION = "v4l-utils is a collection of command line utilities for Video4Linux."
HOMEPAGE = "https://linuxtv.org/downloads/v4l-utils/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=962784ac70a2da7b5df4b974e044b713"

SRC_URI = "https://linuxtv.org/downloads/v4l-utils/v4l-utils-${PV}.tar.bz2"
SRC_URI[sha256sum] = "a6cbeb13b0a82f53b303f88becfe5b7c16a89fa3264b14b30425c48c966eead6"

S = "${WORKDIR}/v4l-utils-${PV}"

inherit autotools

# (Optional) DEPENDS - list other Yocto packages required by v4l-utils 
DEPENDS += "libjpeg-turbo" 

# Customize 'EXTRA_OECONF' if specific configuration options are needed during build
EXTRA_OECONF = "" 

do_install_append() {
    # Install any additional files if needed
}
