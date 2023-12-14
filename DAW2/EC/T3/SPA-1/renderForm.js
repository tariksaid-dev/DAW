export function renderForm(elementHTML) {
  const form = document.createElement("form");
  form.className =
    "border text-card-foreground max-w-md bg-white rounded-xl shadow-md overflow-hidden md:max-w-2xl m-4";
  form.setAttribute("data-v0-t", "card");

  form.innerHTML = `
  <div class="flex flex-col space-y-1.5 p-4">
  <h3 class="tracking-tight text-2xl font-bold">User Login</h3>
  <p class="text-sm text-gray-500">Please enter your username and password to log in.</p>
</div>
<div class="p-4">
  <div class="space-y-4">
    <div class="space-y-2">
      <label
        class="peer-disabled:cursor-not-allowed peer-disabled:opacity-70 text-sm font-medium text-gray-700"
        for="username"
      >
        Username
      </label>
      <input
        class="flex h-10 bg-background text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 w-full p-2 border border-gray-300 rounded-md"
        id="username"
        placeholder="Enter username"
        required=""
        type="text"
      />
    </div>
    <div class="space-y-2">
      <label
        class="peer-disabled:cursor-not-allowed peer-disabled:opacity-70 text-sm font-medium text-gray-700"
        for="password"
      >
        Password
      </label>
      <input
        class="flex h-10 bg-background text-sm ring-offset-background file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:cursor-not-allowed disabled:opacity-50 w-full p-2 border border-gray-300 rounded-md"
        id="password"
        placeholder="Enter password"
        required=""
        type="password"
      />
    </div>
  </div>
</div>
<div class="flex items-center p-4">
  <button
    class="inline-flex items-center justify-center text-sm ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 h-10 w-full bg-purple-500 hover:bg-purple-700 text-white font-bold py-2 px-4 rounded"
    id="4rxuon1gxqp"
  >
    Submit
  </button>
</div>
  `;

  elementHTML.appendChild(form);
}
