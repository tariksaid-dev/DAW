# Deploying a WordPress site to GitHub Pages

This repository is an example of a site developed with WordPress and correctly deployed on GitHub Pages. To do that, we used the WordPress plugin called "Simply Static", which can easily download our site in a correct html static format. Just install it, and in the "Generate" tab we can doawnload it locally with just a few clicks.

The only problem we face is with the links. If we are working with WordPress locally, probably we have absolutes links everywhere, pointing to the localhsot domain. In order to make our webpage functional (and not broken, because the styles which comes with the WordPress themes probably have the same problem) we need to fix that. This issue is adressed with more detail in [this post](https://maximorlov.com/deploying-to-github-pages-dont-forget-to-fix-your-links/), so take a look if you want to understand what's really happening. 

Luckily, the plugin "Simply Static" adressed that. Go the "Settings" tab, and the first option under the "General" tab should be "Destination Url". Here, we have 3 options:
1. Absolute urls: This change the absolute route to the new absolute route we want. If we are deploying in GitHub pages, just use complete url of your new domain direction. (should be something like `name.github.io/repo-name/folder-name/`)
2. Relative urls: Every route is changed to act as relative. If we put a / here, the route redirects to `name.github.io/`, so we need just need to write the repo name and the folder name. 
3. Offline use: Easiest way to deploy, all the routes turned relative to the folder we are using. In the case of GitHub pages, it works like a charm (no need to change anything)

