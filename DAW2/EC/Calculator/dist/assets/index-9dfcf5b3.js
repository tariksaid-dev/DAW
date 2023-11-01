(function(){const s=document.createElement("link").relList;if(s&&s.supports&&s.supports("modulepreload"))return;for(const r of document.querySelectorAll('link[rel="modulepreload"]'))n(r);new MutationObserver(r=>{for(const t of r)if(t.type==="childList")for(const c of t.addedNodes)c.tagName==="LINK"&&c.rel==="modulepreload"&&n(c)}).observe(document,{childList:!0,subtree:!0});function a(r){const t={};return r.integrity&&(t.integrity=r.integrity),r.referrerPolicy&&(t.referrerPolicy=r.referrerPolicy),r.crossOrigin==="use-credentials"?t.credentials="include":r.crossOrigin==="anonymous"?t.credentials="omit":t.credentials="same-origin",t}function n(r){if(r.ep)return;r.ep=!0;const t=a(r);fetch(r.href,t)}})();const main="";class Calculator{constructor(e){this.screen=e}factorialResolve(e){var s=e;if(e===0||e===1)return 1;for(;e>1;)e--,s*=e;return s}parseFactorialNumber(e){const s=/(\d+)!/,a=e.match(s);return a&&a[1]?a[1]:null}parseFactorial(e){for(;e.includes("!");)e=e.replace(this.parseFactorialNumber(e).concat("!"),this.factorialResolve(this.parseFactorialNumber(e)));return e}resolve(){let expression=this.screen.value;if(expression.includes("!")){if(this.parseFactorialNumber(expression).length>7)return"ERR! TOO MANY FACTORIAL DIGITS";expression=this.parseFactorial(expression)}try{return eval(expression)}catch(e){return"ERR! CHECK SYNTAXIS "}}}const PI=Math.PI,E=Math.E,screen=document.getElementById("screen"),allButtons=Array.from(document.getElementsByTagName("button")),calc=new Calculator(screen);function handleClick(e){switch(e.textContent){case"AC":screen.value="";break;case"C":screen.value=screen.value.substring(0,screen.value.length-1);break;case"cos":screen.value+="Math.cos(";break;case"log":screen.value+="Math.log(";break;case"tan":screen.value+="Math.tan(";break;case"sin":screen.value+="Math.sin(";break;case"√":screen.value+="Math.sqrt(";break;case"EXP":screen.value+=" * 10 ** ";break;case"^":screen.value+="**";break;case"𝝅":screen.value+=PI;break;case"e":screen.value+=E;break;case"=":screen.value=calc.resolve();break;default:screen.value+=e.textContent}}allButtons.forEach(e=>{e.addEventListener("click",()=>{handleClick(e)})});