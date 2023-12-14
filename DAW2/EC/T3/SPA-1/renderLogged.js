export function renderLogin(elementHTML) {
  const div = document.createElement("div");
  div.className =
    "rounded-lg border bg-card text-card-foreground shadow-sm mx-auto my-20 w-full max-w-md";

  div.innerHTML = `
  <div class="flex flex-col space-y-1.5 p-6">
    <h3 class="font-semibold tracking-tight text-2xl text-center">Welcome</h3>
  </div>
  <div class="p-6 space-y-4">
    <div class="space-y-2">
      <div class="text-center text-lg">You are logged in</div>
      <button class="inline-flex items-center justify-center rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 text-primary-foreground h-10 px-4 py-2 w-full bg-red-500 hover:bg-red-700">Log out</button>
    </div>
  </div>
</div>
  `;

  elementHTML.appendChild(div);
}
