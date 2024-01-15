package com.example.t5p1.ui.inbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class inboxViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public inboxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Inbox");
    }

    public LiveData<String> getText() {
        return mText;
    }
}