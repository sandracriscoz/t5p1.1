package com.example.t5p1.ui.trash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.t5p1.databinding.FragmentTrashBinding;
import com.example.t5p1.databinding.FragmentTrashBinding;

public class trashFragment extends Fragment {

    private FragmentTrashBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        trashViewModel slideshowViewModel =
                new ViewModelProvider(this).get(trashViewModel.class);

        binding = FragmentTrashBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.trash;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}