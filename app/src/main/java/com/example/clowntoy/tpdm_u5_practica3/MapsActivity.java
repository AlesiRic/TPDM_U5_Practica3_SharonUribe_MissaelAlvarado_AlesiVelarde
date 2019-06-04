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
import com.google.android.gms.maps.model.PolygonOptions;

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

        IndoorBuilding[] buildings=new IndoorBuilding[6];



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
        map.addPolygon(new PolygonOptions().add(new LatLng(21.478500, -104.865789),
                new LatLng(21.478418, -104.865539),
                new LatLng(21.478583, -104.865476),
                new LatLng(21.478666, -104.865724)));

        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.478540,-104.865645))
                .title("Edificio Administrativo")
                .visible(true)
        );

        map.addPolygon(new PolygonOptions().add(new LatLng(21.478500, -104.865789),
                new LatLng(21.478418, -104.865539),
                new LatLng(21.478583, -104.865476),
                new LatLng(21.478666, -104.865724)));


        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.477605,-104.866940))
                .title("Edificio BC 'Bastón'")
                .visible(true)
        );

        map.addPolygon(new PolygonOptions().add(new LatLng(21.477702, -104.866424),
                new LatLng(21.477741, -104.866542),
                new LatLng(21.477645, -104.866579),
                new LatLng(21.477615, -104.866615),
                new LatLng(21.477599, -104.866671),
                new LatLng(21.477609, -104.866728),
                new LatLng(21.477811, -104.867341),
                new LatLng(21.477700, -104.867382),
                new LatLng(21.477491, -104.866719),
                new LatLng(21.477490, -104.866647),
                new LatLng(21.477499, -104.866603),
                new LatLng(21.477522, -104.866548),
                new LatLng(21.477557, -104.866483),
                new LatLng(21.477610, -104.866457)));


        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.478010, -104.867116))
                .title("Laboratorio de cómputo")
                .visible(true)
        );

        map.addPolygon(new PolygonOptions().add(new LatLng(21.477856, -104.867066),
                new LatLng(21.478110, -104.866967),
                new LatLng(21.478206, -104.867252),
                new LatLng(21.47952, -104.867351)));


        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.478573, -104.865143))
                .title("Centro de información")
                .visible(true)
        );

        map.addPolygon(new PolygonOptions().add(new LatLng(21.478496, -104.865396),
                new LatLng(21.478760, -104.865292),
                new LatLng(21.478635, -104.864910),
                new LatLng(21.478369, -104.865017)));

        map.addMarker(new MarkerOptions()
                .position(new LatLng(21.478166, -104.867915))
                .title("Edificio UVP")
                .visible(true)
        );

        map.addPolygon(new PolygonOptions().add(new LatLng(21.478299, -104.867701),
                new LatLng(21.478272, -104.868130),
                new LatLng(21.478064, -104.868115),
                new LatLng(21.478091, -104.867687)));

    }





}
