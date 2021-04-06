# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "cob_linear_nav provides a simple navigation instrument driving on a linear path from current position to goal without any planning or obstacle avoidance capabilites.     Obstacle avoidance should be carried out in other package, e.g. <a href="http://ros.org/wiki/cob_collision_velocity_filter">cob_collision_velocity_filter</a>."
AUTHOR = "Felix Zeltner <fez@ipa.fraunhofer.de>"
ROS_AUTHOR = "Matthias Gruhler <mig@ipa.fraunhofer.de>"
HOMEPAGE = "http://ros.org/wiki/cob_linear_nav"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_navigation"
ROS_BPN = "cob_linear_nav"

ROS_BUILD_DEPENDS = " \
    actionlib \
    angles \
    cob-srvs \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    angles \
    cob-srvs \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    angles \
    cob-srvs \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    roscpp \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_navigation-release/archive/release/noetic/cob_linear_nav/0.6.11-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_linear_nav"
SRC_URI = "git://github.com/ipa320/cob_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "c225d76f72f808abd9d951d9fb1614e1613af6f6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}