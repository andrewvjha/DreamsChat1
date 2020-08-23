package com.wishper.chat.interfaces;

import com.wishper.chat.models.Contact;
import com.wishper.chat.models.User;

import java.util.ArrayList;

/**
 * Created by a_man on 01-01-2018.
 */

public interface HomeIneractor {
    User getUserMe();

    ArrayList<Contact> getLocalContacts();

}
