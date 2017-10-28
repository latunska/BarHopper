package acm_aka_the_best.barhopper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class DDMenu extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public DDMenu() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static DDMenu newInstance() {
        DDMenu fragment = new DDMenu();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ddmenu, container, false);



        return rootView;
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        Button uberButton  = (Button) this.getView().findViewById(R.id.uber_button);

        uberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EVAN! ADD UBER STUFF HERE
                Toast toast = Toast.makeText(getActivity().getApplicationContext(),"It works",Toast.LENGTH_SHORT);
                        toast.show();

            }
        });
    }
}
