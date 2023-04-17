package ru.stars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stars.model.Page;
import ru.stars.model.Rating;
import ru.stars.repository.RatingRepository;
import ru.stars.view.RatingDto;

@Service
public class RatingServiceImpl implements RatingService {
    private final RatingRepository ratingRepository;
    private final PageService pageService;

    @Autowired
    public RatingServiceImpl(RatingRepository ratingRepository, PageService pageService) {
        this.ratingRepository = ratingRepository;
        this.pageService = pageService;
    }

    @Override
    public void addRating(RatingDto ratingDto) {
        Page page = pageService.getByCode(ratingDto.getPageCode());

        Rating rating = new Rating();
        rating.setStars(ratingDto.getStars());
        rating.setComment(ratingDto.getComment());
        rating.setPage(page);

        ratingRepository.save(rating);
    }
}
