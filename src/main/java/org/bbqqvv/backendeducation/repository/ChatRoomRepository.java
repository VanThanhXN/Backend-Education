package org.bbqqvv.backendeducation.repository;

import org.bbqqvv.backendeducation.entity.ChatRoom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRoomRepository extends MongoRepository<ChatRoom, String> {
    List<ChatRoom> findAllByMemberIdsContaining(String userId);
}