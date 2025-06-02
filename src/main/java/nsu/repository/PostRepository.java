package nsu.repository;

import nsu.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PostRepository {

    private Map<Long, Post> posts = new HashMap<>();

    public void save(Post post){
        this.posts.put(post.getId(), post);
    }

    public List<Post> findAll(){
        return new ArrayList<>(posts.values());
    }

    public Post findById(long id){
        return posts.get(id);
    }

    public void deleteById(long id){
        posts.remove(id);
    }
}
