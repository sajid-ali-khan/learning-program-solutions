## 1. Define SPA and its benifits
SPA (Single-Page Application) is a web application or website that interacts with the user by dynamically rewriting the current page rather than loading entire new pages from the server. This approach enables faster interactions and smoother user experiences.

### Benifits
- **Speed**: nly data is loaded instead of the whole page.
- **Improved User Experience:** Seamless navigation with no page reloads.
- **Reduced Server Load:** Fewer requests sent to the server.
- **Offline Support:** Easier to enable with client-side caching.

- **Code Reusability:** Client-side logic can be reused across pages.

## 2. Define React and Identify its working
React is a popular JavaScript library developed by Facebook for building user interfaces, especially for single-page applications. It allows developers to create large web applications that can update and render efficiently in response to data changes.

### Working of React: 
- React builds a virtual DOM (an in-memory representation of the real DOM).
- When data changes, React creates a new virtual DOM, compares it with the previous one usingg a process called diffing, and calculates the most efficient way to update the actual DOM.
- It then updates only yhe necessary parts of the DOM, which makes React very efficient.

## 3. Identify the differences between SPA and MPA
- There are no page reloads in SPAs where as there is full page reload on every switch.
- SPA is faster after first load, where as MPA is slower due to full page loads.
- SPAs have more complex client-side logic, while in MPAs, server-side routing is simpler.
- SEO support is harder to implement in SPAs, whereas SEO has better SEO support.
- Examples of SPA are Gmail, Facebook. Examples of MPAs are Amazon, Linkedin.

## 4. Pros and Cons of SPAs
### Pros:
- Fast and responsive after initial load.
- Better user experience.
- Efficient resource use by loading data as needed.
- Simplified development for mobile-like experiences.
### Cons:
- Initial load can be slow due to heavy JS bundle.
- Poor SEO by default unless SSR is implemented.
- Can be complex to manage browser history and routing.
- Requies client-side security considerations.

## 5. Explain about React
React is a component-based javascript library for building UIs. It emphasizes a declaritive approach, where the UI reflects the current state. Developers create components (reusable UI pieces), which manage their own state and logic.

### React is:
- Declaritive: Easier to predict and debug.
- Component-based: UI is broken into independent, reausable pieces.
- Unidirectional data flow: Data flows from the parent to child, making the data lifecycle predictable.

## 6. Define virtual DOM
The virtual DOM (VDOM) is a lightweight javascript representation of the actual DOM. React uses it to optimize rendering.

### Explain features of React
1. JSX(Javascript XML) - Allows writing HTML-like syntax in js.
2. Components - Reusable and composable building blocks of UI.
3. Virtual DOM
4. One-way data binding - Predictable data flow.
5. Hooks - Manage state and side effects in function components.

