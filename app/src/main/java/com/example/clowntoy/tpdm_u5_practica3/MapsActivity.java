package com.example.clowntoy.tpdm_u5_practica3;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker[] markers;


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

        anadirMarcadores(mMap);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(21.478648, -104.866163)));

        mMap.setMinZoomPreference(17);
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                String titulo=marker.getTitle();
                Intent intent=new Intent(MapsActivity.this,MainActivity.class);
                switch (titulo){
                    case "Edificio UD":
                        intent.putExtra("numero",1);
                        startActivity(intent);
                        return true;
                    case "Edificio Administrativo":
                        intent.putExtra("numero",2);
                        startActivity(intent);
                        return true;
                    case "Edificio BC 'Bastón'":
                        intent.putExtra("numero",3);
                        startActivity(intent);
                        return true;
                    case "Laboratorio de cómputo":
                        intent.putExtra("numero",4);
                        startActivity(intent);
                        return true;
                    case "Centro de información":
                        intent.putExtra("numero",5);
                        startActivity(intent);
                        return true;
                    case "Edificio UVP":
                        intent.putExtra("numero",6);
                        startActivity(intent);
                        return true;
                }


                return false;
            }
        });


    }

    public void anadirMarcadores(GoogleMap map){
        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.477767, -104.865892))
                .title("Edificio UD")
                .visible(true)
        );
        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.478540,-104.865645))
                .title("Edificio Administrativo")
                .visible(true)
        );
        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.477605,-104.866940))
                .title("Edificio BC 'Bastón'")
                .visible(true)
        );
        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.478010, -104.867116))
                .title("Laboratorio de cómputo")
                .visible(true)
        );
        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.478573, -104.865143))
                .title("Centro de información")
                .visible(true)
        );
        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.478166, -104.867915))
                .title("Edificio UVP")
                .visible(true)
        );
    }



}
