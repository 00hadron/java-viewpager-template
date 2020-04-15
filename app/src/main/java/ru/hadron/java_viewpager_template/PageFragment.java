package ru.hadron.java_viewpager_template;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {
    private static final String positionKey = "POSITION_KEY";

    private static String TAG = PageFragment.class.getSimpleName();

    public static PageFragment getNewInstance(int position) {
        PageFragment pageFragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(positionKey, position);
        pageFragment.setArguments(args);
        Log.e(TAG, "getNewInstance");
        return pageFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView");
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_page,container, false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView txtPosition = view.findViewById(R.id.txtPosition);
        txtPosition.setText("position - " + getArguments().getInt(positionKey));
        Log.e(TAG, "onViewCreated");
    }
}
