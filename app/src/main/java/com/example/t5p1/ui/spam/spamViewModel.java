package com.example.t5p1.ui.spam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
    public class spamViewModel extends ViewModel {

        private final MutableLiveData<String> mText;

        public spamViewModel() {
            mText = new MutableLiveData<>();
            mText.setValue("Spam");
        }

        public LiveData<String> getText() {
            return mText;
        }
    }
