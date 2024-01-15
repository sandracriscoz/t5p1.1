package com.example.t5p1.ui.trash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class trashViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public trashViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Trash");
    }

    public LiveData<String> getText() {
        return mText;
    }
}