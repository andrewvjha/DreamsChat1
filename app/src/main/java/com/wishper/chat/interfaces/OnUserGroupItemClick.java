package com.wishper.chat.interfaces;

import android.view.View;

import com.wishper.chat.models.Group;
import com.wishper.chat.models.User;


public interface OnUserGroupItemClick {
    void OnUserClick(User user, int position, View userImage);
    void OnGroupClick(Group group, int position, View userImage);
}
