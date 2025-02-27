# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package implements a sound play module using text2wave and aplay through python."
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Florian Weisshardt"
HOMEPAGE = "http://ros.org/wiki/cob_sound"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_driver"
ROS_BPN = "cob_sound"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    cob-srvs \
    diagnostic-msgs \
    message-generation \
    roscpp \
    std-msgs \
    std-srvs \
    visualization-msgs \
    vlc \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    cob-srvs \
    diagnostic-msgs \
    roscpp \
    std-msgs \
    std-srvs \
    visualization-msgs \
    vlc \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-alsa-oss} \
    actionlib \
    actionlib-msgs \
    cob-srvs \
    diagnostic-msgs \
    message-runtime \
    roscpp \
    rospy \
    std-msgs \
    std-srvs \
    visualization-msgs \
    vlc \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_driver-release/archive/release/noetic/cob_sound/0.7.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_sound"
SRC_URI = "git://github.com/ipa320/cob_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "11317723342af73b30115e4d520b6ce1ce456cbb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
