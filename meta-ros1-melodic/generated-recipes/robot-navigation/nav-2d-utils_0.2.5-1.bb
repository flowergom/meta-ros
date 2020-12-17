# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A handful of useful utility functions for nav_core2 packages."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "robot_navigation"
ROS_BPN = "nav_2d_utils"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    nav-2d-msgs \
    nav-core2 \
    nav-grid \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    tf \
    tf2-geometry-msgs \
    tf2-ros \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    nav-2d-msgs \
    nav-core2 \
    nav-grid \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    tf \
    tf2-geometry-msgs \
    tf2-ros \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-2d-msgs \
    nav-core2 \
    nav-grid \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    tf \
    tf2-geometry-msgs \
    tf2-ros \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DLu/robot_navigation-release/archive/release/melodic/nav_2d_utils/0.2.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/nav_2d_utils"
SRC_URI = "git://github.com/DLu/robot_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "3e9c46bf740819eb08b53ebe20e8eab1c28d4043"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}