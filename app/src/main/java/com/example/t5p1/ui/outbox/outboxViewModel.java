package com.example.t5p1.ui.outbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class outboxViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public outboxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Outbox");
    }

    public LiveData<String> getText() {
        return mText;
    }
}