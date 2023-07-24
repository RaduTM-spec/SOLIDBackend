package com.solid.solidbackend.services;

import com.solid.solidbackend.entities.Activity;
import com.solid.solidbackend.entities.MentorActivity;
import com.solid.solidbackend.entities.User;

public interface ActivityService {


    Activity getActivityByName(String activityName);

    MentorActivity addNewMentorToActivity(String activityName, User newMentor, String dueDate);
}
