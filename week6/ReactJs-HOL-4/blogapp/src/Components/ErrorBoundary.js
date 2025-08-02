import React from 'react';

class ErrorBoundary extends React.Component {
  constructor(props) {
    super(props);
    this.state = { hasError: false, errorMessage: '' };
  }

  componentDidCatch(error, info) {
    console.error('Error caught by ErrorBoundary:', error);
    this.setState({ hasError: true, errorMessage: error.message });
    alert(`An error occurred: ${error.message}`);
  }

  render() {
    if (this.state.hasError) {
      return <h3>Something went wrong. Please try again later.</h3>;
    }
    return this.props.children;
  }
}

export default ErrorBoundary;
