package com.baseflow.geolocator_floss.permission;

@FunctionalInterface
public interface PermissionResultCallback {
  void onResult(LocationPermission permission);
}
