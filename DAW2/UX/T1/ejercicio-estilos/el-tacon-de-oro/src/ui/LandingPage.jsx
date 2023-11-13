function LandingPage({ setIsLandingPage, isLandingPage }) {
  return (
    <div className="grid grid-cols-3 h-screen bg-black">
      <img
        src="img/4.jpg"
        className="col-span-1 object-cover min-h-screen opacity-75 animate-fade-up animate-ease-out"
      />
      <img
        src="img/2.jpg"
        className="col-span-1 object-cover min-h-screen opacity-75 animate-fade-down animate-ease-out"
      />
      <img
        src="img/3.jpg"
        className="col-span-1 object-cover min-h-screen opacity-75 animate-fade-up animate-ease-out"
      />
      <div
        className="absolute right-40 z-50 hover:cursor-pointer"
        onClick={() => setIsLandingPage(!isLandingPage)}
      >
        <img
          src="img/logo-white.png"
          className="animate-rotate-y animate-once animate-ease-out"
        />
      </div>
    </div>
  );
}

export default LandingPage;
