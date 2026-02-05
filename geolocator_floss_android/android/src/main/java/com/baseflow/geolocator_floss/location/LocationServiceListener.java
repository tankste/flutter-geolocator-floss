package com.baseflow.geolocator_floss.location;

import com.baseflow.geolocator_floss.errors.ErrorCodes;

import io.flutter.plugin.common.MethodChannel;

public interface LocationServiceListener {
  void onLocationServiceResult(boolean isEnabled);

  void onLocationServiceError(ErrorCodes errorCode);
}
