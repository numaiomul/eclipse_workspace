LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := CIS
LOCAL_SRC_FILES := CIS.cpp

include $(BUILD_SHARED_LIBRARY)
