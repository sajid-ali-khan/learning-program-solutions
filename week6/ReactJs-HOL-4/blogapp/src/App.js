import React from 'react';
import Post from './Components/Post';
import ErrorBoundary from './Components/ErrorBoundary';

function App() {
  return (
    <div className="App">
      <ErrorBoundary>
        <Post />
      </ErrorBoundary>
    </div>
  );
}

export default App;
