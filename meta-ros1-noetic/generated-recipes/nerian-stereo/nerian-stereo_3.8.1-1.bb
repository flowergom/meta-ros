# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Driver node for SceneScan and SP1 stereo vision sensors by Nerian Vision GmbH"
AUTHOR = "Konstantin Schauwecker <konstantin.schauwecker@nerian.com>"
ROS_AUTHOR = "Nerian Vision Technologies <service@nerian.com>"
HOMEPAGE = "http://wiki.ros.org/nerian_stereo"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "nerian_stereo"
ROS_BPN = "nerian_stereo"

ROS_BUILD_DEPENDS = " \
    boost \
    cv-bridge \
    dynamic-reconfigure \
    message-generation \
    nodelet \
    roscpp \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    curl \
    cv-bridge \
    dynamic-reconfigure \
    message-runtime \
    nodelet \
    roscpp \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    curl \
    cv-bridge \
    dynamic-reconfigure \
    message-runtime \
    nodelet \
    roscpp \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/nerian-vision/nerian_stereo-release/archive/release/noetic/nerian_stereo/3.8.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/nerian_stereo"
SRC_URI = "git://github.com/nerian-vision/nerian_stereo-release;${ROS_BRANCH};protocol=https"
SRCREV = "c476268da92a81a4b46acf8764f7bc2b5c848200"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
