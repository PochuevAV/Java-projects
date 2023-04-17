package ru.stars.service;
import ru.stars.view.PageView;
import ru.stars.view.RatingDto;

import java.util.List;
public interface RatingService {
    void addRating(RatingDto ratingDto);
}
