function LandingPage({ setIsLandingPage, isLandingPage }) {
  return (
    <div className="grid grid-cols-3 h-screen bg-black">
      <img
        src="img/4.jpg"
        className="col-span-1 object-cover min-h-screen opacity-75"
      />
      <img
        src="img/2.jpg"
        className="col-span-1 object-cover min-h-screen opacity-75"
      />
      <img
        src="img/3.jpg"
        className="col-span-1 object-cover min-h-screen opacity-75"
      />
      <div
        className="absolute right-40 z-50 hover:cursor-pointer"
        onClick={() => setIsLandingPage(!isLandingPage)}
      >
        <img src="img/logo-white.png" />
      </div>
    </div>
  );
}

export default LandingPage;
