package com.example.lesson2002context;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class UserProfileView implements UserProfileContract.View {
    private View root;
    private TextView userNameTv;
    private ProgressBar progressBar;
    private Button deleteButton;
    private UserProfileContract.Actions actions;

    public UserProfileView(View root) {
        this.root = root;
    }

    private void inirViews() {
        userNameTv = root.findViewById(R.id.user_Tv);
        progressBar = root.findViewById(R.id.progress_bar);
        deleteButton = root.findViewById(R.id.button_delete);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (actions != null)
                    actions.deleteProfileClicked();
            }
        });
    }

    @Override
    public void showUser(User user) {
        userNameTv.setText(user.getName());
    }

    @Override
    public void showProgress(boolean isVisible) {
        progressBar.setVisibility(isVisible ? View.VISIBLE : View.GONE);

    }

    @Override
    public void setActions(UserProfileContract.Actions actions) {
        this.actions = actions;

    }
}
