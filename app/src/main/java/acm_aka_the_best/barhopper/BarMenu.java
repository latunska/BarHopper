package acm_aka_the_best.barhopper;

import android.app.ActionBar;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class BarMenu extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public BarMenu() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static BarMenu newInstance() {
        BarMenu fragment = new BarMenu();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.fragment_bar_menu, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        //ListView lv = (ListView) getView().findViewById(R.id.barList);

        //LinearLayout layout = (LinearLayout) view.findViewById(R.id.linear);
        //LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
         //       ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);


       /* LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,100);
        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,50);

        ArrayList<LinearLayout> elementFrameList = new ArrayList<LinearLayout>();
        ArrayList<TextView> barNameList = new ArrayList<TextView>();
        //ArrayList<LinearLayout> friendsAtBarList

        for(int i=0; i<5; i++)
        {
            elementFrameList.add(new LinearLayout(this.getContext()));
            barNameList.add(new TextView(this.getContext()));

            elementFrameList.get(i).setLayoutParams(params);
            barNameList.get(i).setLayoutParams(textParams);
            barNameList.get(i).setText("test");

            elementFrameList.get(i).addView(barNameList.get(i));
            lv.(elementFrameList.get(i));
        }
        */

    }
}
