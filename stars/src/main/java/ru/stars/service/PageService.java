package ru.stars.service;
import ru.stars.model.Page;
import ru.stars.view.PageView;

import java.util.List;
public interface PageService {
    Page getByCode(String code);
    List<PageView> getPages();
}
