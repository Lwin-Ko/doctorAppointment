package com.id.drapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(12.2958, 76.6394);
        LatLng krh=new LatLng(12.3140,76.6507);
        LatLng bh=new LatLng(12.3208,76.6200);
        LatLng aph=new LatLng(12.2956,76.6320);
        LatLng jjsh=new LatLng(12.2974,76.6538);
        LatLng kah=new LatLng(12.2998,76.6237);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Mysuru"));
        mMap.addMarker(new MarkerOptions().position(krh).title("K R Hospital"));
        mMap.addMarker(new MarkerOptions().position(bh).title("Basappa memorial hospital"));
        mMap.addMarker(new MarkerOptions().position(aph).title("Apollo bgs hospitals"));
        mMap.addMarker(new MarkerOptions().position(jjsh).title("Jss hospital"));
        mMap.addMarker(new MarkerOptions().position(kah).title("Kamakshi hospital"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,10.f));
    }
}
