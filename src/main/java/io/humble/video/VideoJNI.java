/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;

import io.humble.ferry.IBuffer;

class VideoJNI {

// HumbleVideo.i: Start generated code
// >>>>>>>>>>>>>>>>>>>>>>>>>>>

  static {
    io.humble.ferry.Ferry.init();
    io.humble.video.Video.init();
    io.humble.video.Global.init();
  }
  public static void noop() {
    // Here only to force JNI library to load
  }
  
// <<<<<<<<<<<<<<<<<<<<<<<<<<<
// HumbleVideo.i: End generated code
  

  public final static native long Global_NO_PTS_get();
  public final static native long Global_DEFAULT_PTS_PER_SECOND_get();
  public final static native long Global_getVersion();
  public final static native int Global_getVersionMajor();
  public final static native int Global_getVersionMinor();
  public final static native int Global_getVersionRevision();
  public final static native String Global_getVersionStr();
  public final static native int Global_getAVFormatVersion();
  public final static native String Global_getAVFormatVersionStr();
  public final static native int Global_getAVCodecVersion();
  public final static native String Global_getAVCodecVersionStr();
  public final static native void Global_init();
  public final static native void Global_setFFmpegLoggingLevel(int jarg1);
  public final static native int Rational_ROUND_ZERO_get();
  public final static native int Rational_ROUND_INF_get();
  public final static native int Rational_ROUND_DOWN_get();
  public final static native int Rational_ROUND_UP_get();
  public final static native int Rational_ROUND_NEAR_INF_get();
  public final static native int Rational_ROUND_PASS_MINMAX_get();
  public final static native int Rational_getNumerator(long jarg1, Rational jarg1_);
  public final static native int Rational_getDenominator(long jarg1, Rational jarg1_);
  public final static native long Rational_copy(long jarg1, Rational jarg1_);
  public final static native int Rational_compareTo(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native int Rational_sCompareTo(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native double Rational_getDouble(long jarg1, Rational jarg1_);
  public final static native int Rational_reduce(long jarg1, Rational jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native int Rational_sReduce(long jarg1, Rational jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native long Rational_multiply(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native long Rational_sMultiply(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native long Rational_divide(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native long Rational_sDivide(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native long Rational_subtract(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native long Rational_sSubtract(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native long Rational_add(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native long Rational_sAdd(long jarg1, Rational jarg1_, long jarg2, Rational jarg2_);
  public final static native long Rational_rescale__SWIG_0(long jarg1, Rational jarg1_, long jarg2, long jarg3, Rational jarg3_);
  public final static native long Rational_sRescale__SWIG_0(long jarg1, long jarg2, Rational jarg2_, long jarg3, Rational jarg3_);
  public final static native long Rational_make__SWIG_0();
  public final static native long Rational_make__SWIG_1(double jarg1);
  public final static native long Rational_make__SWIG_2(long jarg1, Rational jarg1_);
  public final static native long Rational_make__SWIG_3(int jarg1, int jarg2);
  public final static native long Rational_rescale__SWIG_1(long jarg1, Rational jarg1_, long jarg2, long jarg3, Rational jarg3_, int jarg4);
  public final static native long Rational_sRescale__SWIG_1(long jarg1, long jarg2, Rational jarg2_, long jarg3, Rational jarg3_, int jarg4);
  public final static native long Rational_rescale__SWIG_2(long jarg1, int jarg2, int jarg3, int jarg4, int jarg5, int jarg6);
  public final static native void Rational_setNumerator(long jarg1, Rational jarg1_, int jarg2);
  public final static native void Rational_setDenominator(long jarg1, Rational jarg1_, int jarg2);
  public final static native void Rational_setValue(long jarg1, Rational jarg1_, double jarg2);
  public final static native double Rational_getValue(long jarg1, Rational jarg1_);
  public final static native boolean Rational_isFinalized(long jarg1, Rational jarg1_);
  public final static native void Rational_init(long jarg1, Rational jarg1_);
  public final static native int KeyValueBag_KVB_NONE_get();
  public final static native int KeyValueBag_KVB_MATCH_CASE_get();
  public final static native int KeyValueBag_KVB_DONT_OVERWRITE_get();
  public final static native int KeyValueBag_KVB_APPEND_get();
  public final static native int KeyValueBag_getNumKeys(long jarg1, KeyValueBag jarg1_);
  public final static native String KeyValueBag_getKey(long jarg1, KeyValueBag jarg1_, int jarg2);
  public final static native String KeyValueBag_getValue(long jarg1, KeyValueBag jarg1_, String jarg2, int jarg3);
  public final static native int KeyValueBag_setValue__SWIG_0(long jarg1, KeyValueBag jarg1_, String jarg2, String jarg3);
  public final static native long KeyValueBag_make();
  public final static native int KeyValueBag_setValue__SWIG_1(long jarg1, KeyValueBag jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int Property_PROPERTY_CONST_get();
  public final static native int Property_PROPERTY_IMAGE_SIZE_get();
  public final static native int Property_PROPERTY_PIXEL_FMT_get();
  public final static native int Property_PROPERTY_SAMPLE_FMT_get();
  public final static native int Property_PROPERTY_UNKNOWN_get();
  public final static native int Property_FLAG_ENCODING_PARAM_get();
  public final static native int Property_FLAG_DECODING_PARAM_get();
  public final static native int Property_FLAG_METADATA_get();
  public final static native int Property_FLAG_AUDIO_PARAM_get();
  public final static native int Property_FLAG_VIDEO_PARAM_get();
  public final static native int Property_FLAG_SUBTITLE_PARAM_get();
  public final static native int Property_FLAG_FILTERING_PARAM_get();
  public final static native int Property_PROPERTY_SEARCH_DEFAULT_get();
  public final static native int Property_PROPERTY_SEARCH_CHILDREN_get();
  public final static native String Property_getName(long jarg1, Property jarg1_);
  public final static native String Property_getHelp(long jarg1, Property jarg1_);
  public final static native String Property_getUnit(long jarg1, Property jarg1_);
  public final static native int Property_getType(long jarg1, Property jarg1_);
  public final static native int Property_getFlags(long jarg1, Property jarg1_);
  public final static native long Property_getDefault(long jarg1, Property jarg1_);
  public final static native double Property_getDefaultAsDouble(long jarg1, Property jarg1_);
  public final static native int Property_getNumFlagSettings(long jarg1, Property jarg1_);
  public final static native long Property_getFlagConstant__SWIG_0(long jarg1, Property jarg1_, int jarg2);
  public final static native long Property_getFlagConstant__SWIG_1(long jarg1, Property jarg1_, String jarg2);
  public final static native long MediaData_getTimeStamp(long jarg1, MediaData jarg1_);
  public final static native void MediaData_setTimeStamp(long jarg1, MediaData jarg1_, long jarg2);
  public final static native long MediaData_getTimeBase(long jarg1, MediaData jarg1_);
  public final static native void MediaData_setTimeBase(long jarg1, MediaData jarg1_, long jarg2, Rational jarg2_);
  public final static native long MediaData_getData_internal(long jarg1, MediaData jarg1_);
  public final static native int MediaData_getSize(long jarg1, MediaData jarg1_);
  public final static native boolean MediaData_isKey(long jarg1, MediaData jarg1_);
  public final static native void MediaData_setData_internal(long jarg1, MediaData jarg1_, long jarg2, IBuffer jarg2_);
  public final static native int Error_getType(long jarg1, Error jarg1_);
  public final static native String Error_getDescription(long jarg1, Error jarg1_);
  public final static native int Error_getErrorNumber(long jarg1, Error jarg1_);
  public final static native long Error_make__SWIG_0(int jarg1);
  public final static native long Error_make__SWIG_1(int jarg1);
  public final static native int Error_errorNumberToType(int jarg1);
  public final static native int Error_typeToErrorNumber(int jarg1);
  public final static native long Packet_make__SWIG_0();
  public final static native long Packet_make__SWIG_1(long jarg1, IBuffer jarg1_);
  public final static native long Packet_make__SWIG_2(long jarg1, Packet jarg1_, boolean jarg2);
  public final static native long Packet_make__SWIG_3(int jarg1);
  public final static native long Packet_getPts(long jarg1, Packet jarg1_);
  public final static native void Packet_setPts(long jarg1, Packet jarg1_, long jarg2);
  public final static native long Packet_getDts(long jarg1, Packet jarg1_);
  public final static native void Packet_setDts(long jarg1, Packet jarg1_, long jarg2);
  public final static native int Packet_getSize(long jarg1, Packet jarg1_);
  public final static native int Packet_getMaxSize(long jarg1, Packet jarg1_);
  public final static native int Packet_getStreamIndex(long jarg1, Packet jarg1_);
  public final static native int Packet_getFlags(long jarg1, Packet jarg1_);
  public final static native boolean Packet_isKeyPacket(long jarg1, Packet jarg1_);
  public final static native long Packet_getDuration(long jarg1, Packet jarg1_);
  public final static native long Packet_getPosition(long jarg1, Packet jarg1_);
  public final static native void Packet_setKeyPacket(long jarg1, Packet jarg1_, boolean jarg2);
  public final static native void Packet_setFlags(long jarg1, Packet jarg1_, int jarg2);
  public final static native void Packet_setStreamIndex(long jarg1, Packet jarg1_, int jarg2);
  public final static native void Packet_setDuration(long jarg1, Packet jarg1_, long jarg2);
  public final static native void Packet_setPosition(long jarg1, Packet jarg1_, long jarg2);
  public final static native long Packet_getConvergenceDuration(long jarg1, Packet jarg1_);
  public final static native void Packet_setConvergenceDuration(long jarg1, Packet jarg1_, long jarg2);
  public final static native int Packet_allocateNewPayload(long jarg1, Packet jarg1_, int jarg2);
  public final static native int Configurable_getNumProperties(long jarg1, Configurable jarg1_);
  public final static native long Configurable_getPropertyMetaData__SWIG_0(long jarg1, Configurable jarg1_, int jarg2);
  public final static native long Configurable_getPropertyMetaData__SWIG_1(long jarg1, Configurable jarg1_, String jarg2);
  public final static native int Configurable_setProperty__SWIG_0(long jarg1, Configurable jarg1_, String jarg2, String jarg3);
  public final static native int Configurable_setProperty__SWIG_1(long jarg1, Configurable jarg1_, String jarg2, double jarg3);
  public final static native int Configurable_setProperty__SWIG_2(long jarg1, Configurable jarg1_, String jarg2, long jarg3);
  public final static native int Configurable_setProperty__SWIG_3(long jarg1, Configurable jarg1_, String jarg2, boolean jarg3);
  public final static native int Configurable_setProperty__SWIG_4(long jarg1, Configurable jarg1_, String jarg2, long jarg3, Rational jarg3_);
  public final static native String Configurable_getPropertyAsString(long jarg1, Configurable jarg1_, String jarg2);
  public final static native double Configurable_getPropertyAsDouble(long jarg1, Configurable jarg1_, String jarg2);
  public final static native long Configurable_getPropertyAsLong(long jarg1, Configurable jarg1_, String jarg2);
  public final static native long Configurable_getPropertyAsRational(long jarg1, Configurable jarg1_, String jarg2);
  public final static native boolean Configurable_getPropertyAsBoolean(long jarg1, Configurable jarg1_, String jarg2);
  public final static native int Configurable_setProperty__SWIG_5(long jarg1, Configurable jarg1_, long jarg2, KeyValueBag jarg2_, long jarg3, KeyValueBag jarg3_);
  public final static native int PixelFormat_FMT_NONE_get();
  public final static native int PixelFormat_FMT_RGBA64BE_get();
  public final static native int PixelFormat_FMT_0RGB_get();
  public final static native int PixelFormat_YUV_Y_get();
  public final static native int PixelFormat_YUV_U_get();
  public final static native int PixelFormat_YUV_V_get();
  public final static native int MediaDescriptor_MEDIA_UNKNOWN_get();
  public final static native int MediaDescriptor_MEDIA_VIDEO_get();
  public final static native int MediaDescriptor_MEDIA_AUDIO_get();
  public final static native int MediaDescriptor_MEDIA_DATA_get();
  public final static native int MediaDescriptor_MEDIA_SUBTITLE_get();
  public final static native int MediaDescriptor_MEDIA_ATTACHMENT_get();
  public final static native int CodecProfile_PROFILE_UNKNOWN_get();
  public final static native int CodecProfile_PROFILE_RESERVED_get();
  public final static native int CodecProfile_PROFILE_AAC_MAIN_get();
  public final static native int CodecProfile_PROFILE_AAC_LOW_get();
  public final static native int CodecProfile_PROFILE_AAC_SSR_get();
  public final static native int CodecProfile_PROFILE_AAC_LTP_get();
  public final static native int CodecProfile_PROFILE_AAC_HE_get();
  public final static native int CodecProfile_PROFILE_AAC_HE_V2_get();
  public final static native int CodecProfile_PROFILE_AAC_LD_get();
  public final static native int CodecProfile_PROFILE_AAC_ELD_get();
  public final static native int CodecProfile_PROFILE_DTS_get();
  public final static native int CodecProfile_PROFILE_DTS_ES_get();
  public final static native int CodecProfile_PROFILE_DTS_96_24_get();
  public final static native int CodecProfile_PROFILE_DTS_HD_HRA_get();
  public final static native int CodecProfile_PROFILE_DTS_HD_MA_get();
  public final static native int CodecProfile_PROFILE_MPEG2_422_get();
  public final static native int CodecProfile_PROFILE_MPEG2_HIGH_get();
  public final static native int CodecProfile_PROFILE_MPEG2_SS_get();
  public final static native int CodecProfile_PROFILE_MPEG2_SNR_SCALABLE_get();
  public final static native int CodecProfile_PROFILE_MPEG2_MAIN_get();
  public final static native int CodecProfile_PROFILE_MPEG2_SIMPLE_get();
  public final static native int CodecProfile_PROFILE_H264_CONSTRAINED_get();
  public final static native int CodecProfile_PROFILE_H264_INTRA_get();
  public final static native int CodecProfile_PROFILE_H264_BASELINE_get();
  public final static native int CodecProfile_PROFILE_H264_CONSTRAINED_BASELINE_get();
  public final static native int CodecProfile_PROFILE_H264_MAIN_get();
  public final static native int CodecProfile_PROFILE_H264_EXTENDED_get();
  public final static native int CodecProfile_PROFILE_H264_HIGH_get();
  public final static native int CodecProfile_PROFILE_H264_HIGH_10_get();
  public final static native int CodecProfile_PROFILE_H264_HIGH_10_INTRA_get();
  public final static native int CodecProfile_PROFILE_H264_HIGH_422_get();
  public final static native int CodecProfile_PROFILE_H264_HIGH_422_INTRA_get();
  public final static native int CodecProfile_PROFILE_H264_HIGH_444_get();
  public final static native int CodecProfile_PROFILE_H264_HIGH_444_PREDICTIVE_get();
  public final static native int CodecProfile_PROFILE_H264_HIGH_444_INTRA_get();
  public final static native int CodecProfile_PROFILE_H264_CAVLC_444_get();
  public final static native int CodecProfile_PROFILE_VC1_SIMPLE_get();
  public final static native int CodecProfile_PROFILE_VC1_MAIN_get();
  public final static native int CodecProfile_PROFILE_VC1_COMPLEX_get();
  public final static native int CodecProfile_PROFILE_VC1_ADVANCED_get();
  public final static native int CodecProfile_PROFILE_MPEG4_SIMPLE_get();
  public final static native int CodecProfile_PROFILE_MPEG4_SIMPLE_SCALABLE_get();
  public final static native int CodecProfile_PROFILE_MPEG4_CORE_get();
  public final static native int CodecProfile_PROFILE_MPEG4_MAIN_get();
  public final static native int CodecProfile_PROFILE_MPEG4_N_BIT_get();
  public final static native int CodecProfile_PROFILE_MPEG4_SCALABLE_TEXTURE_get();
  public final static native int CodecProfile_PROFILE_MPEG4_SIMPLE_FACE_ANIMATION_get();
  public final static native int CodecProfile_PROFILE_MPEG4_BASIC_ANIMATED_TEXTURE_get();
  public final static native int CodecProfile_PROFILE_MPEG4_HYBRID_get();
  public final static native int CodecProfile_PROFILE_MPEG4_ADVANCED_REAL_TIME_get();
  public final static native int CodecProfile_PROFILE_MPEG4_CORE_SCALABLE_get();
  public final static native int CodecProfile_PROFILE_MPEG4_ADVANCED_CODING_get();
  public final static native int CodecProfile_PROFILE_MPEG4_ADVANCED_CORE_get();
  public final static native int CodecProfile_PROFILE_MPEG4_ADVANCED_SCALABLE_TEXTURE_get();
  public final static native int CodecProfile_PROFILE_MPEG4_SIMPLE_STUDIO_get();
  public final static native int CodecProfile_PROFILE_MPEG4_ADVANCED_SIMPLE_get();
  public final static native int CodecProfile_getProfile(long jarg1, CodecProfile jarg1_);
  public final static native String CodecProfile_getName(long jarg1, CodecProfile jarg1_);
  public final static native int Codec_DISCARD_NONE_get();
  public final static native int Codec_DISCARD_DEFAULT_get();
  public final static native int Codec_DISCARD_NONREF_get();
  public final static native int Codec_DISCARD_BIDIR_get();
  public final static native int Codec_DISCARD_NONKEY_get();
  public final static native int Codec_DISCARD_ALL_get();
  public final static native int Codec_ID_BRENDER_PIX_get();
  public final static native int Codec_ID_Y41P_get();
  public final static native int Codec_ID_ESCAPE130_get();
  public final static native int Codec_ID_EXR_get();
  public final static native int Codec_ID_AVRP_get();
  public final static native int Codec_ID_012V_get();
  public final static native int Codec_ID_G2M_get();
  public final static native int Codec_ID_AVUI_get();
  public final static native int Codec_ID_AYUV_get();
  public final static native int Codec_ID_TARGA_Y216_get();
  public final static native int Codec_ID_V308_get();
  public final static native int Codec_ID_V408_get();
  public final static native int Codec_ID_YUV4_get();
  public final static native int Codec_ID_SANM_get();
  public final static native int Codec_ID_PAF_VIDEO_get();
  public final static native int Codec_ID_AVRN_get();
  public final static native int Codec_ID_CPIA_get();
  public final static native int Codec_ID_XFACE_get();
  public final static native int Codec_ID_SGIRLE_get();
  public final static native int Codec_ID_MVC1_get();
  public final static native int Codec_ID_MVC2_get();
  public final static native int Codec_ID_FIRST_AUDIO_get();
  public final static native int Codec_ID_PCM_S16LE_get();
  public final static native int Codec_ID_PCM_S24LE_PLANAR_get();
  public final static native int Codec_ID_PCM_S32LE_PLANAR_get();
  public final static native int Codec_ID_PCM_S16BE_PLANAR_get();
  public final static native int Codec_ID_ADPCM_IMA_QT_get();
  public final static native int Codec_ID_VIMA_get();
  public final static native int Codec_ID_ADPCM_AFC_get();
  public final static native int Codec_ID_ADPCM_IMA_OKI_get();
  public final static native int Codec_ID_AMR_NB_get();
  public final static native int Codec_ID_RA_144_get();
  public final static native int Codec_ID_ROQ_DPCM_get();
  public final static native int Codec_ID_MP2_get();
  public final static native int Codec_ID_FFWAVESYNTH_get();
  public final static native int Codec_ID_8SVX_RAW_get();
  public final static native int Codec_ID_SONIC_get();
  public final static native int Codec_ID_SONIC_LS_get();
  public final static native int Codec_ID_PAF_AUDIO_get();
  public final static native int Codec_ID_OPUS_get();
  public final static native int Codec_ID_TAK_get();
  public final static native int Codec_ID_EVRC_get();
  public final static native int Codec_ID_SMV_get();
  public final static native int Codec_ID_FIRST_SUBTITLE_get();
  public final static native int Codec_ID_DVD_SUBTITLE_get();
  public final static native int Codec_ID_MICRODVD_get();
  public final static native int Codec_ID_EIA_608_get();
  public final static native int Codec_ID_JACOSUB_get();
  public final static native int Codec_ID_SAMI_get();
  public final static native int Codec_ID_REALTEXT_get();
  public final static native int Codec_ID_SUBVIEWER1_get();
  public final static native int Codec_ID_SUBVIEWER_get();
  public final static native int Codec_ID_SUBRIP_get();
  public final static native int Codec_ID_WEBVTT_get();
  public final static native int Codec_ID_MPL2_get();
  public final static native int Codec_ID_VPLAYER_get();
  public final static native int Codec_ID_PJS_get();
  public final static native int Codec_ID_FIRST_UNKNOWN_get();
  public final static native int Codec_ID_TTF_get();
  public final static native int Codec_ID_BINTEXT_get();
  public final static native int Codec_ID_XBIN_get();
  public final static native int Codec_ID_IDF_get();
  public final static native int Codec_ID_OTF_get();
  public final static native int Codec_ID_SMPTE_KLV_get();
  public final static native int Codec_ID_PROBE_get();
  public final static native int Codec_ID_MPEG2TS_get();
  public final static native int Codec_ID_MPEG4SYSTEMS_get();
  public final static native int Codec_ID_FFMETADATA_get();
  public final static native int Codec_CAP_DRAW_HORIZ_BAND_get();
  public final static native int Codec_CAP_DR1_get();
  public final static native int Codec_CAP_TRUNCATED_get();
  public final static native int Codec_CAP_HWACCEL_get();
  public final static native int Codec_CAP_DELAY_get();
  public final static native int Codec_CAP_SMALL_LAST_FRAME_get();
  public final static native int Codec_CAP_HWACCEL_VDPAU_get();
  public final static native int Codec_CAP_SUBFRAMES_get();
  public final static native int Codec_CAP_EXPERIMENTAL_get();
  public final static native int Codec_CAP_CHANNEL_CONF_get();
  public final static native int Codec_CAP_NEG_LINESIZES_get();
  public final static native int Codec_CAP_FRAME_THREADS_get();
  public final static native int Codec_CAP_SLICE_THREADS_get();
  public final static native int Codec_CAP_PARAM_CHANGE_get();
  public final static native int Codec_CAP_AUTO_THREADS_get();
  public final static native int Codec_CAP_VARIABLE_FRAME_SIZE_get();
  public final static native int Codec_CAP_INTRA_ONLY_get();
  public final static native int Codec_CAP_LOSSLESS_get();
  public final static native boolean Codec_hasCapability(long jarg1, Codec jarg1_, int jarg2);
  public final static native int CodecDescriptor_PROP_INTRA_ONLY_get();
  public final static native int CodecDescriptor_PROP_LOSSY_get();
  public final static native int CodecDescriptor_PROP_LOSSLESS_get();
  public final static native int CodecDescriptor_PROP_BITMAP_SUB_get();
  public final static native boolean CodecDescriptor_hasProperty(long jarg1, CodecDescriptor jarg1_, int jarg2);
  public final static native String CodecDescriptor_getName(long jarg1, CodecDescriptor jarg1_);
  public final static native String CodecDescriptor_getLongName(long jarg1, CodecDescriptor jarg1_);
  public final static native int CodecDescriptor_getProperties(long jarg1, CodecDescriptor jarg1_);
  public final static native int CodecDescriptor_getId(long jarg1, CodecDescriptor jarg1_);
  public final static native int CodecDescriptor_getType(long jarg1, CodecDescriptor jarg1_);
  public final static native long CodecDescriptor_make(int jarg1);
  public final static native int ContainerFormat_INVALID_FLAG_get();
  public final static native int ContainerFormat_NO_FILE_get();
  public final static native int ContainerFormat_NEED_NUMBER_get();
  public final static native int ContainerFormat_SHOW_IDS_get();
  public final static native int ContainerFormat_RAW_PICTURE_get();
  public final static native int ContainerFormat_GLOBAL_HEADER_get();
  public final static native int ContainerFormat_NO_TIMESTAMPS_get();
  public final static native int ContainerFormat_GENERIC_INDEX_get();
  public final static native int ContainerFormat_TIMESTAMP_DISCONTINUITIES_get();
  public final static native int ContainerFormat_VARIABLE_FPS_get();
  public final static native int ContainerFormat_NO_DIMENSIONS_get();
  public final static native int ContainerFormat_NO_STREAMS_get();
  public final static native int ContainerFormat_NO_BINARY_SEARCH_get();
  public final static native int ContainerFormat_NO_GENERIC_SEARCH_get();
  public final static native int ContainerFormat_NO_BYTE_SEEKING_get();
  public final static native int ContainerFormat_ALLOW_FLUSH_get();
  public final static native int ContainerFormat_NONSTRICT_TIMESTAMPS_get();
  public final static native int ContainerFormat_SEEK_TO_PTS_get();
  public final static native String ContainerFormat_getName(long jarg1, ContainerFormat jarg1_);
  public final static native String ContainerFormat_getLongName(long jarg1, ContainerFormat jarg1_);
  public final static native String ContainerFormat_getExtensions(long jarg1, ContainerFormat jarg1_);
  public final static native int ContainerFormat_getFlags(long jarg1, ContainerFormat jarg1_);
  public final static native int ContainerFormat_getNumSupportedCodecs(long jarg1, ContainerFormat jarg1_);
  public final static native int ContainerFormat_getSupportedCodecId(long jarg1, ContainerFormat jarg1_, int jarg2);
  public final static native long ContainerFormat_getSupportedCodecTag(long jarg1, ContainerFormat jarg1_, int jarg2);
  public final static native void delete_ContainerFormat(long jarg1);
  public final static native String SinkFormat_getName(long jarg1, SinkFormat jarg1_);
  public final static native String SinkFormat_getLongName(long jarg1, SinkFormat jarg1_);
  public final static native String SinkFormat_getExtensions(long jarg1, SinkFormat jarg1_);
  public final static native int SinkFormat_getFlags(long jarg1, SinkFormat jarg1_);
  public final static native int SinkFormat_getDefaultAudioCodecId(long jarg1, SinkFormat jarg1_);
  public final static native int SinkFormat_getDefaultVideoCodecId(long jarg1, SinkFormat jarg1_);
  public final static native int SinkFormat_getDefaultSubtitleCodecId(long jarg1, SinkFormat jarg1_);
  public final static native String SinkFormat_getMimeType(long jarg1, SinkFormat jarg1_);
  public final static native long SinkFormat_guessFormat(String jarg1, String jarg2, String jarg3);
  public final static native int SinkFormat_guessCodec(long jarg1, SinkFormat jarg1_, String jarg2, String jarg3, String jarg4, int jarg5);
  public final static native int SinkFormat_getNumSupportedCodecs(long jarg1, SinkFormat jarg1_);
  public final static native int SinkFormat_getSupportedCodecId(long jarg1, SinkFormat jarg1_, int jarg2);
  public final static native long SinkFormat_getSupportedCodecTag(long jarg1, SinkFormat jarg1_, int jarg2);
  public final static native int SinkFormat_getNumFormats();
  public final static native long SinkFormat_getFormat(int jarg1);
  public final static native String SourceFormat_getName(long jarg1, SourceFormat jarg1_);
  public final static native String SourceFormat_getLongName(long jarg1, SourceFormat jarg1_);
  public final static native String SourceFormat_getExtensions(long jarg1, SourceFormat jarg1_);
  public final static native int SourceFormat_getFlags(long jarg1, SourceFormat jarg1_);
  public final static native int SourceFormat_getNumSupportedCodecs(long jarg1, SourceFormat jarg1_);
  public final static native int SourceFormat_getSupportedCodecId(long jarg1, SourceFormat jarg1_, int jarg2);
  public final static native long SourceFormat_getSupportedCodecTag(long jarg1, SourceFormat jarg1_, int jarg2);
  public final static native long SourceFormat_findFormat(String jarg1);
  public final static native int SourceFormat_getNumFormats();
  public final static native long SourceFormat_getFormat(int jarg1);
  public final static native int IndexEntry_INDEX_FLAG_KEYFRAME_get();
  public final static native long IndexEntry_make(long jarg1, long jarg2, int jarg3, int jarg4, int jarg5);
  public final static native long IndexEntry_getPosition(long jarg1, IndexEntry jarg1_);
  public final static native long IndexEntry_getTimeStamp(long jarg1, IndexEntry jarg1_);
  public final static native int IndexEntry_getFlags(long jarg1, IndexEntry jarg1_);
  public final static native int IndexEntry_getSize(long jarg1, IndexEntry jarg1_);
  public final static native int IndexEntry_getMinDistance(long jarg1, IndexEntry jarg1_);
  public final static native boolean IndexEntry_isKeyFrame(long jarg1, IndexEntry jarg1_);
  public final static native int ContainerStream_DISPOSITION_DEFAULT_get();
  public final static native int ContainerStream_DISPOSITION_DUB_get();
  public final static native int ContainerStream_DISPOSITION_ORIGINAL_get();
  public final static native int ContainerStream_DISPOSITION_COMMENT_get();
  public final static native int ContainerStream_DISPOSITION_LYRICS_get();
  public final static native int ContainerStream_DISPOSITION_KARAOKE_get();
  public final static native int ContainerStream_DISPOSITION_FORCED_get();
  public final static native int ContainerStream_DISPOSITION_HEARING_IMPAIRED_get();
  public final static native int ContainerStream_DISPOSITION_VISUAL_IMPAIRED_get();
  public final static native int ContainerStream_DISPOSITION_CLEAN_EFFECTS_get();
  public final static native int ContainerStream_DISPOSITION_ATTACHED_PIC_get();
  public final static native int ContainerStream_PARSE_NONE_get();
  public final static native int ContainerStream_PARSE_FULL_get();
  public final static native int ContainerStream_PARSE_HEADERS_get();
  public final static native int ContainerStream_PARSE_TIMESTAMPS_get();
  public final static native int ContainerStream_PARSE_FULL_ONCE_get();
  public final static native int ContainerStream_PARSE_FULL_RAW_get();
  public final static native int ContainerStream_getIndex(long jarg1, ContainerStream jarg1_);
  public final static native int ContainerStream_getId(long jarg1, ContainerStream jarg1_);
  public final static native long ContainerStream_getFrameRate(long jarg1, ContainerStream jarg1_);
  public final static native long ContainerStream_getTimeBase(long jarg1, ContainerStream jarg1_);
  public final static native long ContainerStream_getStartTime(long jarg1, ContainerStream jarg1_);
  public final static native long ContainerStream_getDuration(long jarg1, ContainerStream jarg1_);
  public final static native long ContainerStream_getCurrentDts(long jarg1, ContainerStream jarg1_);
  public final static native int ContainerStream_getNumIndexEntries(long jarg1, ContainerStream jarg1_);
  public final static native long ContainerStream_getNumFrames(long jarg1, ContainerStream jarg1_);
  public final static native long ContainerStream_getSampleAspectRatio(long jarg1, ContainerStream jarg1_);
  public final static native long ContainerStream_getContainer(long jarg1, ContainerStream jarg1_);
  public final static native int ContainerStream_getParseType(long jarg1, ContainerStream jarg1_);
  public final static native void ContainerStream_setParseType(long jarg1, ContainerStream jarg1_, int jarg2);
  public final static native long ContainerStream_getMetaData(long jarg1, ContainerStream jarg1_);
  public final static native long ContainerStream_findTimeStampEntryInIndex(long jarg1, ContainerStream jarg1_, long jarg2, int jarg3);
  public final static native int ContainerStream_findTimeStampPositionInIndex(long jarg1, ContainerStream jarg1_, long jarg2, int jarg3);
  public final static native long ContainerStream_getIndexEntry(long jarg1, ContainerStream jarg1_, int jarg2);
  public final static native int ContainerStream_getDisposition(long jarg1, ContainerStream jarg1_);
  public final static native int Container_FLAG_GENPTS_get();
  public final static native int Container_FLAG_IGNIDX_get();
  public final static native int Container_FLAG_NONBLOCK_get();
  public final static native int Container_FLAG_IGNDTS_get();
  public final static native int Container_FLAG_NOFILLIN_get();
  public final static native int Container_FLAG_NOPARSE_get();
  public final static native int Container_FLAG_NOBUFFER_get();
  public final static native int Container_FLAG_CUSTOM_IO_get();
  public final static native int Container_FLAG_DISCARD_CORRUPT_get();
  public final static native int Container_FLAG_MP4A_LATM_get();
  public final static native int Container_FLAG_SORT_DTS_get();
  public final static native int Container_FLAG_PRIV_OPT_get();
  public final static native int Container_FLAG_KEEP_SIDE_DATA_get();
  public final static native int Container_getState(long jarg1, Container jarg1_);
  public final static native int Container_getNumStreams(long jarg1, Container jarg1_);
  public final static native long Container_getStream(long jarg1, Container jarg1_, int jarg2);
  public final static native long SourceStream_getAttachedPic(long jarg1, SourceStream jarg1_);
  public final static native long Source_make();
  public final static native long Source_getFormat(long jarg1, Source jarg1_);
  public final static native int Source_getState(long jarg1, Source jarg1_);
  public final static native long Source_getSourceFormat(long jarg1, Source jarg1_);
  public final static native int Source_setInputBufferLength(long jarg1, Source jarg1_, int jarg2);
  public final static native int Source_getInputBufferLength(long jarg1, Source jarg1_);
  public final static native int Source_open(long jarg1, Source jarg1_, String jarg2, long jarg3, SourceFormat jarg3_, boolean jarg4, boolean jarg5, long jarg6, KeyValueBag jarg6_, long jarg7, KeyValueBag jarg7_);
  public final static native int Source_close(long jarg1, Source jarg1_);
  public final static native long Source_getSourceStream(long jarg1, Source jarg1_, int jarg2);
  public final static native int Source_read(long jarg1, Source jarg1_, long jarg2, Packet jarg2_);
  public final static native int Source_queryStreamMetaData(long jarg1, Source jarg1_);
  public final static native long Source_getDuration(long jarg1, Source jarg1_);
  public final static native long Source_getStartTime(long jarg1, Source jarg1_);
  public final static native long Source_getFileSize(long jarg1, Source jarg1_);
  public final static native int Source_getBitRate(long jarg1, Source jarg1_);
  public final static native int Source_getFlags(long jarg1, Source jarg1_);
  public final static native void Source_setFlags(long jarg1, Source jarg1_, int jarg2);
  public final static native boolean Source_getFlag(long jarg1, Source jarg1_, int jarg2);
  public final static native void Source_setFlag(long jarg1, Source jarg1_, int jarg2, boolean jarg3);
  public final static native String Source_getURL(long jarg1, Source jarg1_);
  public final static native int Source_getReadRetryCount(long jarg1, Source jarg1_);
  public final static native void Source_setReadRetryCount(long jarg1, Source jarg1_, int jarg2);
  public final static native boolean Source_canStreamsBeAddedDynamically(long jarg1, Source jarg1_);
  public final static native long Source_getMetaData(long jarg1, Source jarg1_);
  public final static native int Source_setForcedAudioCodec(long jarg1, Source jarg1_, int jarg2);
  public final static native int Source_setForcedVideoCodec(long jarg1, Source jarg1_, int jarg2);
  public final static native int Source_setForcedSubtitleCodec(long jarg1, Source jarg1_, int jarg2);
  public final static native int Source_SEEK_BACKWARD_get();
  public final static native int Source_SEEK_BYTE_get();
  public final static native int Source_SEEK_ANY_get();
  public final static native int Source_SEEK_FRAME_get();
  public final static native int Source_seek(long jarg1, Source jarg1_, int jarg2, long jarg3, long jarg4, long jarg5, int jarg6);
  public final static native int Source_getMaxDelay(long jarg1, Source jarg1_);
  public final static native int Source_play(long jarg1, Source jarg1_);
  public final static native int Source_pause(long jarg1, Source jarg1_);
  public final static native long SWIGGlobalUpcast(long jarg1);
  public final static native long SWIGRationalUpcast(long jarg1);
  public final static native long SWIGKeyValueBagUpcast(long jarg1);
  public final static native long SWIGPropertyUpcast(long jarg1);
  public final static native long SWIGMediaDataUpcast(long jarg1);
  public final static native long SWIGMediaRawDataUpcast(long jarg1);
  public final static native long SWIGMediaEncodedDataUpcast(long jarg1);
  public final static native long SWIGErrorUpcast(long jarg1);
  public final static native long SWIGPacketUpcast(long jarg1);
  public final static native long SWIGConfigurableUpcast(long jarg1);
  public final static native long SWIGPixelFormatUpcast(long jarg1);
  public final static native long SWIGMediaDescriptorUpcast(long jarg1);
  public final static native long SWIGCodecProfileUpcast(long jarg1);
  public final static native long SWIGCodecUpcast(long jarg1);
  public final static native long SWIGCodecDescriptorUpcast(long jarg1);
  public final static native long SWIGContainerFormatUpcast(long jarg1);
  public final static native long SWIGSinkFormatUpcast(long jarg1);
  public final static native long SWIGSourceFormatUpcast(long jarg1);
  public final static native long SWIGIndexEntryUpcast(long jarg1);
  public final static native long SWIGContainerStreamUpcast(long jarg1);
  public final static native long SWIGContainerUpcast(long jarg1);
  public final static native long SWIGSourceStreamUpcast(long jarg1);
  public final static native long SWIGSourceUpcast(long jarg1);
}
