#                                               -*- Autoconf -*-
# Process this file with autoconf to produce a configure script.

m4_define([MLIB_MAJOR_VERSION], [2])
m4_define([MLIB_MINOR_VERSION], [4])
AC_PREREQ(2.63b)
AC_INIT([librtmp],[MLIB_MAJOR_VERSION.MLIB_MINOR_VERSION],[info@humble.io])
AC_CONFIG_MACRO_DIR([m4])
AM_INIT_AUTOMAKE([-Wall -Werror no-dependencies nostdinc tar-pax subdir-objects 1.10.2 ])

AM_PROG_AR
AM_SILENT_RULES([yes])
AC_CANONICAL_BUILD
AC_CANONICAL_HOST

AC_CONFIG_SRCDIR([src/librtmp/rtmp.h])
AC_CONFIG_HEADERS([config.h])

LIB_MAJOR_VERSION=MLIB_MAJOR_VERSION
LIB_MINOR_VERSION=MLIB_MINOR_VERSION
VERSION=${LIB_MAJOR_VERSION}.${LIB_MINOR_VERSION}.humble
AC_SUBST([VERSION])
AC_SUBST([LIB_MAJOR_VERSION])
AC_SUBST([LIB_MINOR_VERSION])
AC_DEFINE(LIB_MAJOR_VERSION, [LIB_MAJOR_VERSION], [Major version of library])
AC_DEFINE(LIB_MINOR_VERSION, [LIB_MINOR_VERSION], [Minor version of library])
CRYPTO_REQ=libssl,libcrypto
AC_SUBST([CRYPTO_REQ])

LT_PREREQ([2.2.7b])
LT_INIT([disable-fast-install win32-dll])
PKG_PROG_PKG_CONFIG

# Checks for programs.
AC_PROG_CXX
AC_PROG_AWK
AC_PROG_CC
AM_PROG_CC_C_O
AC_PROG_CPP
AC_PROG_INSTALL
AC_PROG_LN_S
AC_PROG_MAKE_SET

# Checks for libraries.
PKG_CHECK_MODULES([ZLIB], [zlib >= 1 ])
PKG_CHECK_MODULES([OPENSSL], [openssl >= 1 ])

AC_CHECK_HEADERS([windows.h])
AC_CHECK_HEADERS([mmsystem.h], [], [], [
#ifdef HAVE_WINDOWS_H
#include <windows.h>
#endif
])
AC_CHECK_LIB([pthread], [pthread_create])

# Checks for header files.
AC_CHECK_HEADERS([arpa/inet.h fcntl.h limits.h netdb.h netinet/in.h stddef.h stdint.h stdlib.h string.h sys/param.h sys/socket.h unistd.h])

# Checks for typedefs, structures, and compiler characteristics.
AC_C_INLINE
AC_TYPE_INT16_T
AC_TYPE_INT32_T
AC_TYPE_INT8_T
AC_TYPE_OFF_T
AC_TYPE_SIZE_T
AC_HEADER_STDBOOL
AC_TYPE_UINT32_T
AC_TYPE_UINT8_T

# Checks for library functions.
AC_FUNC_FORK
AC_FUNC_FSEEKO
AC_FUNC_MALLOC
AC_FUNC_MKTIME
AC_FUNC_REALLOC
AC_FUNC_STRTOD
AC_CHECK_FUNCS([gethostbyname inet_ntoa memchr memset select socket strcasecmp strchr strdup strerror strncasecmp strrchr strstr strtol])

case $host_os in
  *mingw*|*cygwin*)
  LIBS+="-lssl -lcrypto -lz -lws2_32 -lwinmm -lgdi32"
  ;;
esac
PRIVATE_LIBS="${LIBS}"
AC_SUBST([PRIVATE_LIBS])
PUBLIC_LIBS="${LIBS}"
AC_SUBST([PUBLIC_LIBS])


AC_CONFIG_FILES([Makefile
librtmp.pc:src/librtmp/librtmp.pc.in])

AC_OUTPUT
