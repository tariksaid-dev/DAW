import Footer from "./Footer";
import Header from "./Header";
import Main from "./Main";
import Sidebar from "./Sidebar";

function AppLayout() {
  return (
    <div className="grid grid-cols-[17rem,1fr] grid-rows-[1fr,15fr,1fr] h-screen">
      <Header />
      <Sidebar />
      <Main />
      <Footer />
    </div>
  );
}

export default AppLayout;
