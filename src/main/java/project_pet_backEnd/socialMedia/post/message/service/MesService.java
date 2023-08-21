package project_pet_backEnd.socialMedia.post.message.service;



import project_pet_backEnd.socialMedia.post.message.dto.req.MessageRequest;
import project_pet_backEnd.socialMedia.post.message.dto.req.UpMesReq;
import project_pet_backEnd.socialMedia.post.message.vo.Message;
import project_pet_backEnd.utils.commonDto.ResultResponse;

import java.util.List;


public interface MesService {


    ResultResponse<Message> create(Integer userId, MessageRequest messageRequest);

    ResultResponse<Message> update(Integer userId, Integer mesId, UpMesReq upMesReq);

    ResultResponse<String> delete(Integer userId, int messageId);

    ResultResponse<List<Message>> findMessageByPostId(int postId);

    ResultResponse<Message> getMesById(int messageId);


}