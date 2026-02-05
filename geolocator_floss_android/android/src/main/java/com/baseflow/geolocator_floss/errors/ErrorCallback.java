package com.baseflow.geolocator_floss.errors;

@FunctionalInterface
public interface ErrorCallback {
  void onError(ErrorCodes errorCode);
}
