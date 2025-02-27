# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "ROS package of IRIS Localization and Mapping (LaMa)."
AUTHOR = "Eurico Pedrosa <efp@ua.pt>"
ROS_AUTHOR = "Eurico Pedrosa <efp@ua.pt>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "iris_lama_ros"
ROS_BPN = "iris_lama_ros"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    iris-lama \
    message-filters \
    nav-msgs \
    rosbag \
    rosbag-storage \
    roscpp \
    std-srvs \
    tf \
    tf-conversions \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    iris-lama \
    message-filters \
    nav-msgs \
    rosbag \
    rosbag-storage \
    roscpp \
    std-srvs \
    tf \
    tf-conversions \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    iris-lama \
    message-filters \
    nav-msgs \
    rosbag \
    rosbag-storage \
    roscpp \
    std-srvs \
    tf \
    tf-conversions \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/eupedrosa/iris_lama_ros-release/archive/release/noetic/iris_lama_ros/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/iris_lama_ros"
SRC_URI = "git://github.com/eupedrosa/iris_lama_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "8d09313617d645ee51734ae5cdc459209f112a9d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
