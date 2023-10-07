import { useState } from "react";
import AppLayout from "./ui/AppLayout";
import LandingPage from "./ui/LandingPage";

function App() {
  const [isLandingPage, setIsLandingPage] = useState(true);

  return (
    <>
      {isLandingPage ? (
        <LandingPage
          setIsLandingPage={setIsLandingPage}
          isLandingPage={isLandingPage}
        />
      ) : (
        <AppLayout />
      )}
    </>
  );
}

export default App;
