package com.baseflow.geolocator_floss.location;

import android.location.Location;

@FunctionalInterface
public interface PositionChangedCallback {
  void onPositionChanged(Location location);
}
