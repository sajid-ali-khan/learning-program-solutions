import React from 'react';
import PostModel from '../Models/Post';

class Post extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  async loadPosts() {
    try {
      const response = await fetch("https://jsonplaceholder.typicode.com/posts");
      if (!response.ok) throw new Error('Failed to fetch posts');

      const data = await response.json();
      const posts = data.map(item => new PostModel(item.id, item.title, item.body));

      this.setState({ posts });
    } catch (error) {
      throw error;
    }
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h2>Posts</h2>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h4>{post.title}</h4>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Post;
