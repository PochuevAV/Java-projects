package com.mine.openapi_lesson;


import com.mine.openapi_lesson.model.Loco;
import com.mine.openapi_lesson.model.Service;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    private final Service service;
    @Autowired
    public RestController(Service service) {
        this.service = service;
    }

    @GetMapping("/all-loco")
    @Operation(description = "Получить все локомотивы")
    public List<Loco> getAllLoco(){
        return service.getLocoList();
    }
    @PostMapping("/add")
    @Operation(description = "Добавить локомотив")
    public void addLoco(@RequestBody Loco loco){
        service.addLoco(loco);
    }

    @DeleteMapping("/delete")
    @Operation(description = "Удалить локомотив")
    public void deleteLoco (@RequestParam int id){
        service.deleteLoco(id);
    }

    @PutMapping("/edit")
    @Operation(description = "Отредактировать локомотив")
    public void editLoco (@RequestParam int id, @RequestBody Loco loco){
        service.getLocoList().get(id).copy(loco);
    }
}
