package com.github.CommentTODO.toyspringbootpayment.repository;

import com.github.CommentTODO.toyspringbootpayment.domain.Item;
import java.util.List;
import java.util.Optional;

public interface ItemRepository {

  Item save(Item item);

  Optional<Item> findById(Long id);

  List<Item> findAll();

  void update(Long itemId, ItemUpdateDto item);

  void delete(Long itemId);
}
