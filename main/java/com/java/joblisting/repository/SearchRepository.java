package com.java.joblisting.repository;

import com.java.joblisting.Model.Post;
import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);


}
