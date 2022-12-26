package com.gondue.shop.board.api;

import com.gondue.shop.board.dto.BoardPostDTO;
import com.gondue.shop.board.entity.BoardEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.gondue.shop.board.api.BoardApiController.BASE_URL;

@RestController
@Slf4j
@RequestMapping(BASE_URL)
public class BoardApiController {

    protected static final String BASE_URL = "/boards";

    @GetMapping
    public ResponseEntity<?> list() {
        log.info("{} GET request!!", BASE_URL);

        List<BoardEntity> boardEntityList = new ArrayList<>();
        BoardEntity board1 = BoardEntity.builder()
                .boardNo(1L)
                .title("아 ㄹㅇ 망겜 컨텐츠 겁나 없네")
                .writer("토끼곤듀")
                .content("ㅡㅡ 업데이트 빨리좀 해주지")
                .regDate(LocalDateTime.now())
                .build();

        BoardEntity board2 = BoardEntity.builder()
                .boardNo(2L)
                .title("설날인데 새뱃돈 얼마들 받으셧나요?")
                .writer("뜨거운효자")
                .content("우리 집은 저보고 갓수라고 새뱃돈 안주던데 님들도 그런가요??")
                .regDate(LocalDateTime.now())
                .build();

        boardEntityList.add(board1);
        boardEntityList.add(board2);

        return ResponseEntity.ok().body(boardEntityList);
    }

    @PostMapping
    public ResponseEntity<?> register(@Validated @RequestBody BoardPostDTO postDTO, BindingResult result) {
        log.info("{} POST request!!", BASE_URL);
        log.info("received data from client - {}", postDTO);

        if (result.hasErrors()) return ResponseEntity.badRequest().body(result.toString());

        return ResponseEntity.ok().body("REG_SUCCESS");
    }

    @GetMapping("/{boardNo}")
    public ResponseEntity<?> detail(@PathVariable Long boardNo) {
        log.info("{}/{} GET request!!", BASE_URL, boardNo);

        BoardEntity board3 = BoardEntity.builder()
                .boardNo(3L)
                .title("꺼어억~")
                .writer("전손왕")
                .content("가드레일 박고 차 전손났다. 안전운전해라 ㅅㄱ")
                .regDate(LocalDateTime.now())
                .build();

        return ResponseEntity.ok().body(board3);
    }

    @DeleteMapping("/{boardNo}")
    public ResponseEntity<?> remove(@PathVariable Long boardNo) {
        log.info("{}/{} DELETE request!!", BASE_URL, boardNo);

        return ResponseEntity.ok().body("DEL_SUCCESS");
    }

    @PutMapping("/{boardNo}")
    public ResponseEntity<?> update(@PathVariable Long boardNo, @RequestBody BoardEntity entity) {
        log.info("{}/{} PUT request!!", BASE_URL, boardNo);
        log.info("received data from client - {}", entity);

        return ResponseEntity.ok().body("MOD_SUCCESS");
    }
}
